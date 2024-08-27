package com.kaopiz.kprogresshud;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.assetgro.stockgro.prod.R;
import h.q0;
import w.k;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public e f12063a;

    /* renamed from: b, reason: collision with root package name */
    public float f12064b;

    /* renamed from: c, reason: collision with root package name */
    public int f12065c;

    /* renamed from: d, reason: collision with root package name */
    public float f12066d;

    /* renamed from: e, reason: collision with root package name */
    public Context f12067e;

    /* renamed from: f, reason: collision with root package name */
    public int f12068f;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kaopiz.kprogresshud.f, java.lang.Object] */
    public static f a(Context context) {
        ?? obj = new Object();
        obj.f12067e = context;
        obj.f12063a = new e(obj, context);
        obj.f12064b = s0.g.f34069a;
        obj.f12065c = context.getResources().getColor(R.color.kprogresshud_default_color);
        obj.f12068f = 1;
        obj.f12066d = 10.0f;
        obj.c();
        return obj;
    }

    public final void b() {
        e eVar;
        Context context = this.f12067e;
        if (context != null && !((Activity) context).isFinishing() && (eVar = this.f12063a) != null && eVar.isShowing()) {
            eVar.dismiss();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.kaopiz.kprogresshud.g, android.widget.ImageView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.view.View, com.kaopiz.kprogresshud.b] */
    public final void c() {
        a aVar;
        a aVar2;
        int e10 = k.e(1);
        Context context = this.f12067e;
        if (e10 != 0) {
            if (e10 != 1) {
                if (e10 != 2) {
                    if (e10 != 3) {
                        aVar = null;
                    } else {
                        ?? view = new View(context);
                        view.f12049e = 100;
                        Paint paint = new Paint(1);
                        view.f12045a = paint;
                        paint.setStyle(Paint.Style.STROKE);
                        view.f12045a.setStrokeWidth(yk.g.r(2.0f, view.getContext()));
                        view.f12045a.setColor(-1);
                        Paint paint2 = new Paint(1);
                        view.f12046b = paint2;
                        paint2.setStyle(Paint.Style.FILL);
                        view.f12046b.setColor(-1);
                        view.f12050f = yk.g.r(5.0f, view.getContext());
                        float f10 = view.f12050f;
                        view.f12048d = new RectF(f10, f10, ((view.getWidth() - view.f12050f) * 0) / view.f12049e, view.getHeight() - view.f12050f);
                        view.f12047c = new RectF();
                        aVar2 = view;
                    }
                } else {
                    aVar = new a(context, 0);
                }
            } else {
                aVar2 = new a(context, 1);
            }
            aVar = aVar2;
        } else {
            ?? imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.kprogresshud_spinner);
            imageView.f12070b = 83;
            imageView.f12072d = new q0(imageView, 29);
            aVar = imageView;
        }
        e eVar = this.f12063a;
        eVar.getClass();
        if (aVar != null) {
            if (aVar instanceof c) {
                eVar.f12051a = aVar;
            }
            if (aVar instanceof d) {
                eVar.f12052b = (d) aVar;
            }
            eVar.f12053c = aVar;
            if (eVar.isShowing()) {
                eVar.f12058h.removeAllViews();
                eVar.f12058h.addView(aVar, new ViewGroup.LayoutParams(-2, -2));
            }
        }
    }

    public final void d() {
        e eVar = this.f12063a;
        if (eVar == null || !eVar.isShowing()) {
            eVar.show();
        }
    }
}
