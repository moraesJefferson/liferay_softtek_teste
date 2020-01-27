<%@page import="br.com.liferay.test.model.Pessoa"%>
<%@page import="br.com.liferay.test.service.PlanoSaudeLocalServiceUtil"%>
<%@page import="br.com.liferay.portlet.TestePortlet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.liferay.test.service.PlanoSaudeLocalService"%>
<%@page import="javax.portlet.RenderRequest"%>
<%@page import="br.com.liferay.test.model.PlanoSaude"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>

<portlet:actionURL name="producer" var="producer" />

<%List<PlanoSaude> listaPlano = PlanoSaudeLocalServiceUtil.getPlanoSaudes(0, PlanoSaudeLocalServiceUtil.getPlanoSaudesCount());%>
<%Pessoa pessoa = null;%>

	<aui:form action="${producer}" method="post">
		<aui:model-context bean="<%=pessoa %>" model="<%=Pessoa.class %>"></aui:model-context>
	    <aui:fieldset>
	  
			<div class="row">	
				<div class="form-group col-lg-4">
					<aui:select id="plano" name="plano" value="plano">
					  	<c:forEach var="currOption" items="${listaPlano}">
				        	<aui:option value="${currOption.getDescricao()}" label="${currOption.getDescricao()}"selected="${currOption==selOption?true:false}" />
		 		    	</c:forEach>
					</aui:select>
				</div>
				
				<div class="form-group col-lg-4">
					<aui:input name="nome" label="Nome" value="" type="text" id="nome" placeholder="Nome" maxlength="50" autocomplete="off">
						 <aui:validator name="required" errorMessage="Campo Nome obrig�torio." />
					</aui:input>	
				</div>
				
				<div class="form-group col-lg-4">
					<aui:input name = "dt_nascimento" label="Data de Nascimetno" type="date" class="form-control date-mask" id="dt_nascimento" maxlength="10" autocomplete="off">
						 <aui:validator name="required" errorMessage="Campo Data de Nascimento obrig�torio." />
					</aui:input>
				</div>
				
			</div>
			
			<div class="row">	
				
				<div class="form-group col-lg-4">
					<aui:input name="cpf" label="CPF" type="number" id="cpf" placeholder="CPF" maxlength="11"  autocomplete="off">
						<aui:validator name="required" errorMessage="Campo CPF obrig�torio." />
					</aui:input>	
				</div>
				
				<div class="form-group col-lg-4">
					<aui:input name="rg" label="RG" type="number" id="rg" placeholder="RG" maxlength="11" autocomplete="off">
						<aui:validator name="required" errorMessage="Campo RG obrig�torio." />
					</aui:input>	
				</div>
				
				<div class="form-group col-lg-4">
					<aui:input  name="dt_expedicao" label="Data de Expedi��o" type="date" class="form-control date-mask" id="dt_expedicao" maxlength="10" autocomplete="off">
						<aui:validator name="required" errorMessage="Campo Data de Expedi��o obrig�torio." />
					</aui:input>
				</div>
				
			</div>
			
			<div class="row">	
				
				<div class="form-group col-lg-4">
					<aui:input name="nome_pai" label="Nome do Pai" type="text" id="nome_pai" placeholder="Nome do pai" maxlength="50"   autocomplete="off">
						<aui:validator name="required" errorMessage="Campo Nome do Pai obrig�torio." />
					</aui:input>	
				</div>
				
				<div class="form-group col-lg-4">
					<aui:input name="nome_mae" label="Nome da Mae" type="text" id="nome_mae" placeholder="Nome da m�e" maxlength="50"   autocomplete="off">
						<aui:validator name="required" errorMessage="Campo Nome da m�e obrig�torio." />
					</aui:input>	
				</div>
				
				<div class="form-group col-lg-3">
					<aui:input  name="naturalidade" label="Naturalidade" type="text" class="form-control date-mask" id="naturalidade" placeholder="Naturalidade" maxlength="50" autocomplete="off">
						<aui:validator name="required" errorMessage="Campo Naturalidade obrig�torio." />
					</aui:input>
				</div>
				
				<div class="form-group col-lg-1">
					<aui:input  name="uf" value="" label="UF" type="text" class="form-control date-mask" id="uf" placeholder="Ex.: CE" maxlength="2" autocomplete="off">
						<aui:validator name="required" errorMessage="Campo UF obrig�torio." />
					</aui:input>
				</div>
				
			</div>
			
	        <aui:button value="Selecionar" id="btnSubmit" type="submit"/>
	    </aui:fieldset>
	</aui:form>
	
