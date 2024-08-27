package com.assetgro.stockgro.ui.hedwig.utils;

import ak.o;
import ak.p;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.assetgro.stockgro.prod.R;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import com.bumptech.glide.h;
import ef.c;
import h.m;
import java.util.ArrayList;
import jk.i;
import nk.a;
import nk.e;

/* loaded from: classes.dex */
public class PhotoViewerActivity extends m {
    @Override // androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_photo_viewer);
        String stringExtra = getIntent().getStringExtra("url");
        String stringExtra2 = getIntent().getStringExtra("type");
        ImageView imageView = (ImageView) findViewById(R.id.main_image_view);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        progressBar.setVisibility(0);
        o oVar = p.f558d;
        if (stringExtra2 != null && stringExtra2.toLowerCase().contains("gif")) {
            c cVar = new c(progressBar, 0);
            e eVar = (e) ((e) new a().o(i.f21456b, Boolean.TRUE)).f(oVar);
            g w10 = b.c(this).d(this).i(jk.c.class).w(h.f10819m);
            w10.F = stringExtra;
            w10.J = true;
            g w11 = w10.w(eVar);
            w11.G = null;
            ArrayList arrayList = new ArrayList();
            w11.G = arrayList;
            arrayList.add(cVar);
            w11.z(imageView);
            return;
        }
        c cVar2 = new c(progressBar, 1);
        g w12 = b.c(this).d(this).m(stringExtra).w((e) ((e) new a().o(i.f21456b, Boolean.TRUE)).f(oVar));
        w12.G = null;
        ArrayList arrayList2 = new ArrayList();
        w12.G = arrayList2;
        arrayList2.add(cVar2);
        w12.z(imageView);
    }
}
