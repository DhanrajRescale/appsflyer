package com.kaopiz.kprogresshud;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes2.dex */
public final class e extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    public c f12051a;

    /* renamed from: b, reason: collision with root package name */
    public d f12052b;

    /* renamed from: c, reason: collision with root package name */
    public View f12053c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f12054d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f12055e;

    /* renamed from: f, reason: collision with root package name */
    public String f12056f;

    /* renamed from: g, reason: collision with root package name */
    public String f12057g;

    /* renamed from: h, reason: collision with root package name */
    public FrameLayout f12058h;

    /* renamed from: i, reason: collision with root package name */
    public BackgroundLayout f12059i;

    /* renamed from: j, reason: collision with root package name */
    public int f12060j;

    /* renamed from: k, reason: collision with root package name */
    public int f12061k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f12062l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Context context) {
        super(context);
        this.f12062l = fVar;
        this.f12060j = -1;
        this.f12061k = -1;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.kprogresshud_hud);
        Window window = getWindow();
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.addFlags(2);
        WindowManager.LayoutParams attributes = window.getAttributes();
        f fVar = this.f12062l;
        attributes.dimAmount = fVar.f12064b;
        attributes.gravity = 17;
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(false);
        BackgroundLayout backgroundLayout = (BackgroundLayout) findViewById(R.id.background);
        this.f12059i = backgroundLayout;
        int i10 = fVar.f12065c;
        backgroundLayout.f12039b = i10;
        backgroundLayout.a(i10, backgroundLayout.f12038a);
        BackgroundLayout backgroundLayout2 = this.f12059i;
        float r10 = yk.g.r(fVar.f12066d, backgroundLayout2.getContext());
        backgroundLayout2.f12038a = r10;
        backgroundLayout2.a(backgroundLayout2.f12039b, r10);
        this.f12058h = (FrameLayout) findViewById(R.id.container);
        View view = this.f12053c;
        if (view != null) {
            this.f12058h.addView(view, new ViewGroup.LayoutParams(-2, -2));
        }
        c cVar = this.f12051a;
        if (cVar != null) {
            cVar.a();
        }
        d dVar = this.f12052b;
        if (dVar != null) {
            ((g) dVar).f12070b = (int) (83.0f / fVar.f12068f);
        }
        TextView textView = (TextView) findViewById(R.id.label);
        this.f12054d = textView;
        String str = this.f12056f;
        int i11 = this.f12060j;
        this.f12056f = str;
        this.f12060j = i11;
        if (textView != null) {
            if (str != null) {
                textView.setText(str);
                this.f12054d.setTextColor(i11);
                this.f12054d.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        TextView textView2 = (TextView) findViewById(R.id.details_label);
        this.f12055e = textView2;
        String str2 = this.f12057g;
        int i12 = this.f12061k;
        this.f12057g = str2;
        this.f12061k = i12;
        if (textView2 != null) {
            if (str2 != null) {
                textView2.setText(str2);
                this.f12055e.setTextColor(i12);
                this.f12055e.setVisibility(0);
                return;
            }
            textView2.setVisibility(8);
        }
    }
}
