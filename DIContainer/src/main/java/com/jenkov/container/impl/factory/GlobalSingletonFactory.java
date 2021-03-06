/*
    Copyright 2007-2010 Jenkov Development

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/



package com.jenkov.container.impl.factory;

import com.jenkov.container.itf.factory.IGlobalFactory;

/**
    todo fix phase execution on local products
 */
public class GlobalSingletonFactory extends GlobalFactoryBase implements IGlobalFactory {

    public Object[] localProducts = null;

    public Class getReturnType() {
        return getLocalInstantiationFactory().getReturnType();
    }

    public synchronized Object instance(Object ... parameters) {
        if(this.localProducts == null){
            this.localProducts = new Object[getLocalProductCount()];
            this.localProducts[0] = getLocalInstantiationFactory().instance(parameters, localProducts);
            execPhase("config", parameters, localProducts);
        }
        return this.localProducts[0];
    }

    public Object[] execPhase(String phase, Object ... parameters) {
        return execPhase(phase, parameters, this.localProducts);
    }

    public String toString() {
        return "<GlobalSingletonFactory> --> "+ getLocalInstantiationFactory().toString();
    }


}
