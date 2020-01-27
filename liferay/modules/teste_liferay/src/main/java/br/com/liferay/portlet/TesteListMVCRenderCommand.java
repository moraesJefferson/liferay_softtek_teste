package br.com.liferay.portlet;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import br.com.liferay.constants.TestePortletKeys;
import br.com.liferay.test.model.PlanoSaude;
import br.com.liferay.test.service.PlanoSaudeLocalService;

@Component(
		immediate = true,
		property = {
				"javax.portlet.display-name=Teste",
				"javax.portlet.init-param.template-path=/",
				"javax.portlet.init-param.view-template=/gerenciar.jsp",
				"javax.portlet.name=" + TestePortletKeys.TESTE,
				"mvc.command.name=/"
		},
		service = MVCRenderCommand.class
	)

public class TesteListMVCRenderCommand implements MVCRenderCommand {
	
	@Reference
	private PlanoSaudeLocalService planoSaudeLocalService;

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		List<PlanoSaude> listaPlano = planoSaudeLocalService.findAll();
		renderRequest.setAttribute("listaPlano", listaPlano);	
		return null;
	}

}
