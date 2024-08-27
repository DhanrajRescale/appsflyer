package nv;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class g extends n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f29208a;

    @Override // nv.n
    public final o a(Type type) {
        if (RequestBody.class.isAssignableFrom(e1.e(type))) {
            return b.f29179a;
        }
        return null;
    }

    @Override // nv.n
    public final o b(Type type, Annotation[] annotationArr, x0 x0Var) {
        if (type == ResponseBody.class) {
            if (e1.h(annotationArr, pv.w.class)) {
                return c.f29183a;
            }
            return a.f29175a;
        }
        if (type == Void.class) {
            return f.f29203a;
        }
        if (this.f29208a && type == Unit.class) {
            try {
                return e.f29199a;
            } catch (NoClassDefFoundError unused) {
                this.f29208a = false;
                return null;
            }
        }
        return null;
    }
}
