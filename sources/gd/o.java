package gd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class o extends y1 implements t {

    /* renamed from: u, reason: collision with root package name */
    public final m4.m f17291u;

    /* renamed from: v, reason: collision with root package name */
    public BaseItemViewModel f17292v;

    /* renamed from: w, reason: collision with root package name */
    public v f17293w;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, da.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o(m4.m r5) {
        /*
            r4 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            android.view.View r0 = r5.f27491e
            r4.<init>(r0)
            r4.f17291u = r5
            da.d r5 = new da.d
            r1 = 0
            r5.<init>(r1)
            android.content.Context r1 = r0.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r2 = "null cannot be cast to non-null type com.assetgro.stockgro.StockGroApplication"
            kotlin.jvm.internal.Intrinsics.d(r1, r2)
            com.assetgro.stockgro.StockGroApplication r1 = (com.assetgro.stockgro.StockGroApplication) r1
            da.b r1 = r1.a()
            r5.f14277c = r1
            ea.s0 r1 = new ea.s0
            r1.<init>(r4)
            r5.f14276b = r1
            java.lang.Object r1 = r5.f14277c
            da.b r1 = (da.b) r1
            java.lang.Class<da.b> r2 = da.b.class
            yk.g.g(r2, r1)
            da.a r1 = new da.a
            java.lang.Object r2 = r5.f14276b
            ea.s0 r2 = (ea.s0) r2
            java.lang.Object r5 = r5.f14277c
            da.b r5 = (da.b) r5
            r1.<init>()
            r1.f14247b = r1
            r1.f14246a = r5
            hr.c r5 = new hr.c
            r3 = 22
            r5.<init>(r2, r3)
            xs.b r5 = xs.a.a(r5)
            r1.f14248c = r5
            java.lang.String r5 = "buildViewHolderComponent(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            r4.w(r1)
            androidx.lifecycle.v r5 = r4.u()
            androidx.lifecycle.n r1 = androidx.lifecycle.n.f1948b
            r5.h(r1)
            androidx.lifecycle.v r5 = r4.u()
            androidx.lifecycle.n r1 = androidx.lifecycle.n.f1949c
            r5.h(r1)
            r4.x()
            java.lang.String r5 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r4.y(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.o.<init>(m4.m):void");
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o getLifecycle() {
        return u();
    }

    public final v u() {
        v vVar = this.f17293w;
        if (vVar != null) {
            return vVar;
        }
        Intrinsics.k("lifecycleRegistry");
        throw null;
    }

    public final BaseItemViewModel v() {
        BaseItemViewModel baseItemViewModel = this.f17292v;
        if (baseItemViewModel != null) {
            return baseItemViewModel;
        }
        Intrinsics.k("viewModel");
        throw null;
    }

    public abstract void w(da.a aVar);

    public void x() {
        v().f9078f.observe(this, new eb.c(28, new n(this, 0)));
        v().f9077e.observe(this, new eb.c(28, new n(this, 1)));
    }

    public abstract void y(View view);

    public final void z(String text) {
        Intrinsics.checkNotNullParameter(text, "message");
        Context context = this.f22629a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() != 0) {
            Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
            Object systemService = context.getSystemService("layout_inflater");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
            w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
        }
    }
}
