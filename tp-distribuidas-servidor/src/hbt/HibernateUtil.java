package hbt;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import bean.ClienteBean;
import bean.*;

public class HibernateUtil
{
    private static final SessionFactory sessionFactory;
    static
    {
        try
        {
        	 AnnotationConfiguration config = new AnnotationConfiguration();
        	 
        	 config.addAnnotatedClass(CargaBean.class);
        	 config.addAnnotatedClass(ClienteBean.class);
        	 config.addAnnotatedClass(CostoBean.class);
        	 config.addAnnotatedClass(CuentaCorrienteBean.class);
        	 config.addAnnotatedClass(DepositoBean.class);
        	 config.addAnnotatedClass(DireccionBean.class);
        	 config.addAnnotatedClass(EmpleadoBean.class);
        	 config.addAnnotatedClass(EmpresaBean.class);
        	 config.addAnnotatedClass(ItemRemitoBean.class);
        	 config.addAnnotatedClass(MovimientoBean.class);
        	 config.addAnnotatedClass(ParticularBean.class);
        	 config.addAnnotatedClass(ProveedorBean.class);
        	 config.addAnnotatedClass(RegularBean.class);
        	 config.addAnnotatedClass(RemitoBean.class);
        	 config.addAnnotatedClass(ServicioBean.class);
        	 config.addAnnotatedClass(SolicitudDeCargaBean.class);
        	 config.addAnnotatedClass(SolicitudDeCargaConRetiroBean.class);
        	 config.addAnnotatedClass(SucursalBean.class);
        	 config.addAnnotatedClass(VehiculoBean.class);
        	 config.addAnnotatedClass(ViajeBean.class);
        	 config.addAnnotatedClass(ViajeVehiculoContratadoBean.class);
        	 config.addAnnotatedClass(ViajeVehiculoPropioBean.class);
        	 
             sessionFactory = config.buildSessionFactory();
        }
        catch (Throwable ex)
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
  
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
    

}