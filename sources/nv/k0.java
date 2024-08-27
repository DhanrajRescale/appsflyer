package nv;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public final class k0 extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29222b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Method f29223c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29224d;

    /* renamed from: e, reason: collision with root package name */
    public final o f29225e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f29226f;

    public k0(Method method, int i10, o oVar, String str) {
        this.f29223c = method;
        this.f29224d = i10;
        this.f29225e = oVar;
        this.f29226f = str;
    }

    @Override // bl.j
    public final void k(s0 s0Var, Object obj) {
        int i10 = this.f29222b;
        o oVar = this.f29225e;
        Object obj2 = this.f29226f;
        Method method = this.f29223c;
        int i11 = this.f29224d;
        switch (i10) {
            case 0:
                if (obj != null) {
                    try {
                        s0Var.f29257i.addPart((Headers) obj2, (RequestBody) oVar.e(obj));
                        return;
                    } catch (IOException e10) {
                        throw e1.j(method, i11, "Unable to convert " + obj + " to RequestBody", e10);
                    }
                }
                return;
            default:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                s0Var.f29257i.addPart(Headers.of("Content-Disposition", nn.d.k("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (RequestBody) oVar.e(value));
                            } else {
                                throw e1.j(method, i11, nn.d.k("Part map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw e1.j(method, i11, "Part map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw e1.j(method, i11, "Part map was null.", new Object[0]);
        }
    }

    public k0(Method method, int i10, Headers headers, o oVar) {
        this.f29223c = method;
        this.f29224d = i10;
        this.f29226f = headers;
        this.f29225e = oVar;
    }
}
