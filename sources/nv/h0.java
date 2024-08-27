package nv;

import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.FormBody;

/* loaded from: classes2.dex */
public final class h0 extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29213b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f29214c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29215d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29216e;

    public /* synthetic */ h0(Method method, int i10, boolean z10, int i11) {
        this.f29213b = i11;
        this.f29214c = method;
        this.f29215d = i10;
        this.f29216e = z10;
    }

    public final void a0(s0 s0Var, Map map) {
        int i10 = this.f29213b;
        boolean z10 = this.f29216e;
        Method method = this.f29214c;
        int i11 = this.f29215d;
        switch (i10) {
            case 0:
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                String obj = value.toString();
                                if (obj != null) {
                                    FormBody.Builder builder = s0Var.f29258j;
                                    if (z10) {
                                        builder.addEncoded(str, obj);
                                    } else {
                                        builder.add(str, obj);
                                    }
                                } else {
                                    throw e1.j(method, i11, "Field map value '" + value + "' converted to null by " + d.class.getName() + " for key '" + str + "'.", new Object[0]);
                                }
                            } else {
                                throw e1.j(method, i11, nn.d.k("Field map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw e1.j(method, i11, "Field map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw e1.j(method, i11, "Field map was null.", new Object[0]);
            default:
                if (map != null) {
                    for (Map.Entry entry2 : map.entrySet()) {
                        String str2 = (String) entry2.getKey();
                        if (str2 != null) {
                            Object value2 = entry2.getValue();
                            if (value2 != null) {
                                String obj2 = value2.toString();
                                if (obj2 != null) {
                                    s0Var.b(str2, obj2, z10);
                                } else {
                                    throw e1.j(method, i11, "Query map value '" + value2 + "' converted to null by " + d.class.getName() + " for key '" + str2 + "'.", new Object[0]);
                                }
                            } else {
                                throw e1.j(method, i11, nn.d.k("Query map contained null value for key '", str2, "'."), new Object[0]);
                            }
                        } else {
                            throw e1.j(method, i11, "Query map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw e1.j(method, i11, "Query map was null", new Object[0]);
        }
    }

    @Override // bl.j
    public final /* bridge */ /* synthetic */ void k(s0 s0Var, Object obj) {
        switch (this.f29213b) {
            case 0:
                a0(s0Var, (Map) obj);
                return;
            default:
                a0(s0Var, (Map) obj);
                return;
        }
    }
}
