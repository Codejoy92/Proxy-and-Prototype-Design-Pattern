package genericCheckpointing.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import genericCheckpointing.server.StoreRestoreI;
import genericCheckpointing.xmlStoreRestore.StoreRestoreHandler;


public class ProxyCreator {

	public StoreRestoreI createProxy(Class<?>[] interfaceArray, StoreRestoreHandler  handler) {
		StoreRestoreI  serDeserObj  =
	            (StoreRestoreI)
	            Proxy.newProxyInstance(
	                                   getClass().getClassLoader(),
	                                   interfaceArray,
	                                   (InvocationHandler) handler
	                                   );
		return serDeserObj ;
	}

}
