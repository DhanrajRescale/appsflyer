package mv;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* loaded from: classes2.dex */
public final class i extends j {
    @Override // mv.j
    public final void a() {
        Iterator it = ServiceLoader.load(d.class, d.class.getClassLoader()).iterator();
        while (it.hasNext()) {
            try {
                d.c((d) it.next());
            } catch (ServiceConfigurationError e10) {
                if (!(e10.getCause() instanceof SecurityException)) {
                    throw e10;
                }
            }
        }
    }
}
