package d2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.assetgro.stockgro.prod.R;
import java.util.LinkedHashMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class e4 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f13411a = new LinkedHashMap();

    public static final tu.i1 a(Context context) {
        tu.i1 i1Var;
        qu.g0 g0Var;
        qu.a aVar;
        LinkedHashMap linkedHashMap = f13411a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    su.c a10 = hl.f.a(-1, null, 6);
                    tu.j jVar = new tu.j((Function2) new c4(contentResolver, uriFor, new d4(a10, yk.j.N0(Looper.getMainLooper())), a10, context, null));
                    qu.i2 l10 = el.l.l();
                    xu.e eVar = qu.r0.f32255a;
                    CoroutineContext l11 = l10.l(vu.u.f38408a);
                    tu.h1 h1Var = new tu.h1(0L, Long.MAX_VALUE);
                    Float valueOf = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    e5.o D = el.l.D(jVar);
                    tu.k1 a11 = tu.l1.a(valueOf);
                    CoroutineContext coroutineContext = (CoroutineContext) D.f15032e;
                    tu.f fVar = (tu.f) D.f15030c;
                    if (Intrinsics.a(h1Var, tu.a1.f36405a)) {
                        g0Var = qu.g0.f32205a;
                    } else {
                        g0Var = qu.g0.f32208d;
                    }
                    tu.l0 l0Var = new tu.l0(h1Var, fVar, a11, valueOf, null);
                    CoroutineContext u10 = yk.g.u(l11, coroutineContext, true);
                    xu.e eVar2 = qu.r0.f32255a;
                    if (u10 != eVar2 && u10.g(kotlin.coroutines.f.O) == null) {
                        u10 = u10.l(eVar2);
                    }
                    if (g0Var == qu.g0.f32206b) {
                        aVar = new qu.a2(u10, l0Var);
                    } else {
                        aVar = new qu.a(u10, true);
                    }
                    aVar.m0(g0Var, aVar, l0Var);
                    obj = new tu.s0(a11);
                    linkedHashMap.put(context, obj);
                }
                i1Var = (tu.i1) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i1Var;
    }

    public static final t0.v b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof t0.v) {
            return (t0.v) tag;
        }
        return null;
    }
}
