package com.assetgro.stockgro.ui.chat.utils;

import ak.p;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.assetgro.stockgro.prod.R;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import com.bumptech.glide.h;
import h.m;
import java.util.ArrayList;
import java.util.Locale;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import nk.a;
import nk.e;
import qu.i0;
import ue.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/utils/PhotoViewerActivity;", "Lh/m;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PhotoViewerActivity extends m {
    @Override // androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_photo_viewer);
        String stringExtra = getIntent().getStringExtra("url");
        String stringExtra2 = getIntent().getStringExtra("imageType");
        ImageView imageView = (ImageView) findViewById(R.id.main_image_view);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        progressBar.setVisibility(0);
        if (stringExtra2 != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = stringExtra2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (w.s(lowerCase, "gif", false)) {
                s sVar = new s(progressBar, 0);
                a f10 = new a().f(p.f558d);
                Intrinsics.checkNotNullExpressionValue(f10, "diskCacheStrategy(...)");
                g w10 = b.c(this).d(this).i(c.class).w(h.f10819m);
                w10.F = stringExtra;
                w10.J = true;
                g w11 = w10.w((e) f10);
                w11.G = null;
                ArrayList arrayList = new ArrayList();
                w11.G = arrayList;
                arrayList.add(sVar);
                Intrinsics.c(imageView);
                w11.z(imageView);
                return;
            }
        }
        i0.p(this, stringExtra, imageView, new s(progressBar, 1));
    }
}
