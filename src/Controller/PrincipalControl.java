package Controller;

import View.PrincipalView;

public class PrincipalControl
{

    public static void inicializar(PrincipalView view, boolean isAdmin) 
    {
        if(!isAdmin)
        {
            for(int i=4; i>0; i--)
                view.getPainel_funcionalidades().remove(i);
        }
    }
    
    public void verificarBusca(PrincipalView view, boolean isAdmin)
    {
        if(!isAdmin)
        {
            view.getPnButtonsItem().setVisible(false);
        }
    }
}
