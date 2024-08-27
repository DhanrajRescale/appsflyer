package com.assetgro.stockgro.ui.profile.self;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.h1;
import ba.u0;
import ch.c;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.self.ImageCropActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.takusemba.cropme.CropLayout;
import com.webengage.sdk.android.Analytics;
import da.a;
import ea.v;
import gd.b;
import ih.n;
import ih.o;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import okhttp3.HttpUrl;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/profile/self/ImageCropActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/profile/self/ImageCropViewModel;", "Lba/u0;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ImageCropActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10043k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_image_crop;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((ImageCropViewModel) x()).f9084g.observe(this, new c(9, new o(this, 0)));
        ((ImageCropViewModel) x()).f10044n.observe(this, new c(9, new o(this, 1)));
    }

    @Override // gd.b
    public final void I() {
        Drawable mutate;
        final int i10 = 0;
        ((u0) w()).f6261v.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ih.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImageCropActivity f20012b;

            {
                this.f20012b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                ImageCropActivity this$0 = this.f20012b;
                switch (i11) {
                    case 0:
                        int i12 = ImageCropActivity.f10043k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    case 1:
                        int i13 = ImageCropActivity.f10043k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        CropLayout cropLayout = ((u0) this$0.w()).f6259t;
                        if (cropLayout.a()) {
                            Log.w("CropLayout", "Image is off of the frame.");
                        } else {
                            RectF rectF = cropLayout.f12122c;
                            if (rectF != null) {
                                Handler handler = new Handler();
                                Rect rect = new Rect();
                                vs.b bVar = cropLayout.f12120a;
                                bVar.getHitRect(rect);
                                Drawable drawable = bVar.getDrawable();
                                if (drawable != null) {
                                    z2.e block = new z2.e(cropLayout, ((BitmapDrawable) drawable).getBitmap(), rect, rectF, handler, 11);
                                    Intrinsics.checkNotNullParameter(block, "block");
                                    new h5.h(block).start();
                                } else {
                                    throw new ClassCastException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                                }
                            }
                        }
                        if (((u0) this$0.w()).f6259t.a()) {
                            Toast.makeText(this$0.getBaseContext(), "Try to fit the image in the circle", 0).show();
                            return;
                        }
                        return;
                    default:
                        int i14 = ImageCropActivity.f10043k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                }
            }
        });
        ((u0) w()).f6261v.setTitle(HttpUrl.FRAGMENT_ENCODE_SET);
        Drawable navigationIcon = ((u0) w()).f6261v.getNavigationIcon();
        if (navigationIcon != null && (mutate = navigationIcon.mutate()) != null) {
            mutate.setTint(-1);
            ((u0) w()).f6261v.setNavigationIcon(mutate);
        }
        Intent intent = getIntent();
        if (intent != null) {
            Uri parse = Uri.parse(intent.getStringExtra("IMAGE_PATH"));
            if (parse != null) {
                ((u0) w()).f6259t.setUri(parse);
                u0 u0Var = (u0) w();
                n nVar = new n(this);
                CropLayout cropLayout = u0Var.f6259t;
                cropLayout.getClass();
                cropLayout.f12123d.addIfAbsent(nVar);
                final int i11 = 1;
                ((u0) w()).f6260u.setOnClickListener(new View.OnClickListener(this) { // from class: ih.k

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ImageCropActivity f20012b;

                    {
                        this.f20012b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i112 = i11;
                        ImageCropActivity this$0 = this.f20012b;
                        switch (i112) {
                            case 0:
                                int i12 = ImageCropActivity.f10043k;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.onBackPressed();
                                return;
                            case 1:
                                int i13 = ImageCropActivity.f10043k;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                CropLayout cropLayout2 = ((u0) this$0.w()).f6259t;
                                if (cropLayout2.a()) {
                                    Log.w("CropLayout", "Image is off of the frame.");
                                } else {
                                    RectF rectF = cropLayout2.f12122c;
                                    if (rectF != null) {
                                        Handler handler = new Handler();
                                        Rect rect = new Rect();
                                        vs.b bVar = cropLayout2.f12120a;
                                        bVar.getHitRect(rect);
                                        Drawable drawable = bVar.getDrawable();
                                        if (drawable != null) {
                                            z2.e block = new z2.e(cropLayout2, ((BitmapDrawable) drawable).getBitmap(), rect, rectF, handler, 11);
                                            Intrinsics.checkNotNullParameter(block, "block");
                                            new h5.h(block).start();
                                        } else {
                                            throw new ClassCastException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                                        }
                                    }
                                }
                                if (((u0) this$0.w()).f6259t.a()) {
                                    Toast.makeText(this$0.getBaseContext(), "Try to fit the image in the circle", 0).show();
                                    return;
                                }
                                return;
                            default:
                                int i14 = ImageCropActivity.f10043k;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.finish();
                                return;
                        }
                    }
                });
                final int i12 = 2;
                ((u0) w()).f6258s.setOnClickListener(new View.OnClickListener(this) { // from class: ih.k

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ImageCropActivity f20012b;

                    {
                        this.f20012b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i112 = i12;
                        ImageCropActivity this$0 = this.f20012b;
                        switch (i112) {
                            case 0:
                                int i122 = ImageCropActivity.f10043k;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.onBackPressed();
                                return;
                            case 1:
                                int i13 = ImageCropActivity.f10043k;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                CropLayout cropLayout2 = ((u0) this$0.w()).f6259t;
                                if (cropLayout2.a()) {
                                    Log.w("CropLayout", "Image is off of the frame.");
                                } else {
                                    RectF rectF = cropLayout2.f12122c;
                                    if (rectF != null) {
                                        Handler handler = new Handler();
                                        Rect rect = new Rect();
                                        vs.b bVar = cropLayout2.f12120a;
                                        bVar.getHitRect(rect);
                                        Drawable drawable = bVar.getDrawable();
                                        if (drawable != null) {
                                            z2.e block = new z2.e(cropLayout2, ((BitmapDrawable) drawable).getBitmap(), rect, rectF, handler, 11);
                                            Intrinsics.checkNotNullParameter(block, "block");
                                            new h5.h(block).start();
                                        } else {
                                            throw new ClassCastException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                                        }
                                    }
                                }
                                if (((u0) this$0.w()).f6259t.a()) {
                                    Toast.makeText(this$0.getBaseContext(), "Try to fit the image in the circle", 0).show();
                                    return;
                                }
                                return;
                            default:
                                int i14 = ImageCropActivity.f10043k;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.finish();
                                return;
                        }
                    }
                });
                return;
            }
            Toast.makeText(this, "Uri null", 0).show();
            finish();
        }
    }

    @Override // gd.b
    public final void z(a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(ImageCropViewModel.class), new ea.c(k10, compositeDisposable, userRepository, 10));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, ImageCropViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ImageCropViewModel.class, "<this>", ImageCropViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ImageCropViewModel imageCropViewModel = (ImageCropViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(imageCropViewModel);
            this.f17254b = imageCropViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
