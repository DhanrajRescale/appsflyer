package jm;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.URLSpan;
import android.view.View;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.messaging.t;
import java.lang.ref.WeakReference;
import pn.e;
import q.f;
import r3.k;

/* loaded from: classes.dex */
public final class c extends URLSpan {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f21470a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21471b;

    /* renamed from: c, reason: collision with root package name */
    public final f f21472c;

    public c(Context context, String str) {
        super(str);
        this.f21470a = new WeakReference(context);
        this.f21471b = str;
        int i10 = e.i(context, R.attr.colorSurface, k.getColor(context, R.color.design_default_color_primary));
        q.e eVar = new q.e();
        t tVar = new t(1);
        Integer valueOf = Integer.valueOf(i10 | (-16777216));
        tVar.f11782b = valueOf;
        Integer num = (Integer) tVar.f11783c;
        Integer num2 = (Integer) tVar.f11784d;
        Integer num3 = (Integer) tVar.f11785e;
        Bundle bundle = new Bundle();
        if (valueOf != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
        }
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num.intValue());
        }
        if (num2 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num2.intValue());
        }
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num3.intValue());
        }
        eVar.f31445c = bundle;
        eVar.f31443a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        this.f21472c = eVar.a();
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        Context context = (Context) this.f21470a.get();
        if (context != null) {
            this.f21472c.a(context, Uri.parse(this.f21471b));
        }
    }
}
