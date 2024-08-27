package le;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vt.o0;
import y.j0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static fv.e f24606a;

    /* renamed from: b, reason: collision with root package name */
    public static String f24607b;

    /* renamed from: c, reason: collision with root package name */
    public static String f24608c;

    /* renamed from: d, reason: collision with root package name */
    public static String f24609d;

    public static final void a(Function2 function2) {
        fv.g b10;
        fv.e a10 = g.f24613a.a(a3.a.f("groupchat:", f24608c), o0.b(new Pair("token", a3.a.f("Bearer ", f24609d))));
        f24606a = a10;
        a10.d("new_msg_out", new j0(function2, 1));
        fv.e eVar = f24606a;
        if (eVar != null) {
            eVar.d("new_msg_ack", a.f24596j);
        }
        fv.e eVar2 = f24606a;
        if (eVar2 != null) {
            eVar2.d("edit_msg_out", new j0(function2, 2));
        }
        fv.e eVar3 = f24606a;
        if (eVar3 != null) {
            eVar3.d("edit_msg_ack", a.f24597k);
        }
        fv.e eVar4 = f24606a;
        if (eVar4 != null) {
            eVar4.d("del_msg_out", new j0(function2, 3));
        }
        fv.e eVar5 = f24606a;
        if (eVar5 != null) {
            eVar5.d("user:entered", a.f24598l);
        }
        fv.e eVar6 = f24606a;
        if (eVar6 != null) {
            eVar6.d("recent_messages", new j0(function2, 4));
        }
        fv.e eVar7 = f24606a;
        if (eVar7 != null) {
            eVar7.d("phx_join", a.f24599m);
            fv.e eVar8 = f24606a;
            if (eVar8 != null) {
                eVar8.d("phx_close", a.f24600n);
            }
            fv.e eVar9 = f24606a;
            if (eVar9 != null) {
                eVar9.d("phx_error", a.f24592f);
            }
            fv.e eVar10 = f24606a;
            if (eVar10 != null) {
                eVar10.d("phx_leave", a.f24593g);
            }
            try {
                fv.e eVar11 = f24606a;
                if (eVar11 != null && (b10 = fv.e.b(eVar11)) != null) {
                    b10.a("ok", a.f24594h);
                    b10.a("error", a.f24595i);
                }
            } catch (Exception e10) {
                FirebaseCrashlytics.getInstance().recordException(e10);
            }
        }
    }

    public static final void b(fv.f fVar, String str, Function2 function2) {
        Map c10 = fVar.c();
        Intrinsics.d(c10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, android.os.Parcelable?>");
        function2.invoke(c10, str);
    }
}
