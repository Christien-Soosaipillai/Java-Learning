package com.christien.googleguice.b_scopes;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ScopeTester {

    /*
    * By default Scopes are not @Singletons
    *
    * Step 1: Create Interface
    *   -> interface CarRepairService{
    *           public void repair();
    *      }
    *
    * Step 2: Create Implementation
    *   -> class MrLubeRepairService implements CarRepairService{ ... }
    *
    * Step 3: Create Binding Module
    *   -> class CarRepairModule implements AbstractModule {
    *           @Override
    *           public void config(){
    *               bind(CarRepairService.class).to(MrLubeRepairService.class);
    *           }
    *      }
    *
    * Step 4: Create class with dependency
    *   -> class ServiceDesk{
    *
    *           private CarRepairService repairService;
    *
    *           @Inject
    *           public ServiceDesk(CarRepairService repairService){
    *               this.repairService = repairService;
    *           }
    *      }
    *
    * Step 5: Create Injector
    * -> Injector injector = Guice.createInjector(new CarRepairModule());
    *
    * Step 6: Get Object with dependency fulfilled
    * -> ServiceDesk serviceDesk = injector.getInstance(ServiceDesk.class); //Get all objects needed to be injected for ServiceDesk.class
    *
    * Step 7: Use object
    * -> serviceDesk.serviceCar();
    *
    * */
    public static void main(String[] args){

        Injector injector = Guice.createInjector(new CarRepairModule());

        ServiceDesk serviceDesk = injector.getInstance(ServiceDesk.class);
        serviceDesk.serviceCar();

        ServiceDesk serviceDesk2 = injector.getInstance(ServiceDesk.class);
        serviceDesk2.serviceCar();

    }
}
