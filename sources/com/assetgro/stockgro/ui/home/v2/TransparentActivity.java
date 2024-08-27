package com.assetgro.stockgro.ui.home.v2;

import android.os.Bundle;
import h.m;
import hl.f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lf.b;
import lf.j0;
import okhttp3.HttpUrl;
import qu.r0;
import vu.u;
import xu.e;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/home/v2/TransparentActivity;", "Lh/m;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TransparentActivity extends m {
    @Override // androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String text;
        String str;
        String str2;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            text = extras.getString("title");
        } else {
            text = null;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            str = extras2.getString("image");
        } else {
            str = null;
        }
        Bundle extras3 = getIntent().getExtras();
        if (extras3 == null || (str2 = extras3.getString("auto_close")) == null) {
            str2 = "3";
        }
        int i10 = b.f24642b;
        if (text == null) {
            text = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Intrinsics.checkNotNullParameter(text, "text");
        b bVar = new b();
        bVar.setArguments(f.y(new Pair("center_popup_text", text), new Pair("center_popup_image_url", str)));
        bVar.show(getSupportFragmentManager(), "tranasparent_activity");
        e eVar = r0.f32255a;
        g.H(f.d(u.f38408a), null, null, new j0(str2, this, null), 3);
    }
}
