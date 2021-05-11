package it.disim.univaq.demo.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import it.disim.univaq.demo.business.DemoBusiness;

import org.eclipse.jface.dialogs.MessageDialog;

public class SampleHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String andrea = DemoBusiness.getName();
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Ui",
				andrea);
		return null;
	}
}
