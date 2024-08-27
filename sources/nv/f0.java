package nv;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public final class f0 extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29204b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f29205c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29206d;

    /* renamed from: e, reason: collision with root package name */
    public final o f29207e;

    public /* synthetic */ f0(Method method, int i10, o oVar, int i11) {
        this.f29204b = i11;
        this.f29205c = method;
        this.f29206d = i10;
        this.f29207e = oVar;
    }

    @Override // bl.j
    public final void k(s0 s0Var, Object obj) {
        int i10 = this.f29204b;
        o oVar = this.f29207e;
        Method method = this.f29205c;
        int i11 = this.f29206d;
        switch (i10) {
            case 0:
                if (obj != null) {
                    try {
                        s0Var.f29259k = (RequestBody) oVar.e(obj);
                        return;
                    } catch (IOException e10) {
                        throw e1.k(method, e10, i11, "Unable to convert " + obj + " to RequestBody", new Object[0]);
                    }
                }
                throw e1.j(method, i11, "Body parameter value must not be null.", new Object[0]);
            default:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                s0Var.a(str, (String) oVar.e(value));
                            } else {
                                throw e1.j(method, i11, nn.d.k("Header map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw e1.j(method, i11, "Header map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw e1.j(method, i11, "Header map was null.", new Object[0]);
        }
    }
}
