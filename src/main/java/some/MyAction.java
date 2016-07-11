package some;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jahia.bin.Action;
import org.jahia.bin.ActionResult;
import org.jahia.services.content.JCRNodeWrapper;
import org.jahia.services.content.JCRSessionWrapper;
import org.jahia.services.render.RenderContext;
import org.jahia.services.render.Resource;
import org.jahia.services.render.URLResolver;

public class MyAction extends Action {

	@Override
	public ActionResult doExecute(HttpServletRequest request, RenderContext arg1, Resource resource, JCRSessionWrapper session,
			Map<String, List<String>> arg4, URLResolver arg5) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("TMP");
//		return null;
		JCRNodeWrapper node = session.getNodeByUUID(resource.getNode().getIdentifier());
		
		return new ActionResult(HttpServletResponse.SC_OK, request.getHeader("referer"));
	}

}
