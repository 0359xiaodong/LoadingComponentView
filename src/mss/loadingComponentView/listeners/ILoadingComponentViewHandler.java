package mss.loadingComponentView.listeners;

/**
 * 
 * @author Juan Aguilar Guisado
 * @version 1.0
 * @since 1.0
 * 
 */
public interface ILoadingComponentViewHandler {

	/**
	 * Method to update the component view.
	 * 
	 * @param phaseName
	 *            Name of the next phase
	 * @param message
	 *            Message for the TextView
	 * @param status
	 *            Percentage (relative to 100)
	 */
	public void update(String phaseName, String message, int status);

	/**
	 * Method to finish the component behavior directly.
	 */
	void finishComponent();

}
