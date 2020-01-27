package br.com.liferay.portlet;

import br.com.liferay.constants.TestePortletKeys;
import br.com.liferay.test.model.Pessoa;
import br.com.liferay.test.model.PlanoSaude;
import br.com.liferay.test.service.PessoaLocalService;
import br.com.liferay.test.service.PlanoSaudeLocalService;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author jefferson
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Teste",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TestePortletKeys.TESTE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class TestePortlet extends MVCPortlet {
	
	@Reference
	private PessoaLocalService pessoaLocalService;
	
	@Reference
	private PlanoSaudeLocalService planoSaudeLocalService;
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

//		Pessoa pessoa = pessoaLocalService.createPessoa(CounterLocalServiceUtil.increment());	
//		pessoa.setName("T");
//		pessoa.setData_nascimento(date);
//		pessoaLocalService.addPessoa(pessoa);

		super.doView(renderRequest, renderResponse);
	}
	
	@ProcessAction(name = "producer")
	public void get(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		Pessoa pessoa = pessoaLocalService.createPessoa(CounterLocalServiceUtil.increment()); 
		List<PlanoSaude> listaPlano = planoSaudeLocalService.findByDescricao(ParamUtil.getString(actionRequest, "plano"));
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		pessoa.setName(ParamUtil.getString(actionRequest, "nome"));
		pessoa.setData_nascimento(ParamUtil.getDate(actionRequest, "dt_nascimento",df));
		pessoa.setCpf(ParamUtil.getString(actionRequest, "cpf"));
		pessoa.setRg(ParamUtil.getString(actionRequest, "rg"));
		pessoa.setData_expedicao_rg(ParamUtil.getDate(actionRequest, "dt_expedicao",df));
		pessoa.setNome_mae(ParamUtil.getString(actionRequest, "nome_mae"));
		pessoa.setNome_pai(ParamUtil.getString(actionRequest, "nome_pai"));
		pessoa.setNaturalidade(ParamUtil.getString(actionRequest, "naturalidade"));
		pessoa.setUf(ParamUtil.getString(actionRequest, "uf"));
		pessoa.setPlano_id(listaPlano.get(0).getPlano_id());
		pessoaLocalService.addPessoa(pessoa);
}
	
}