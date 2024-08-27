package com.assetgro.stockgro.ui.profile.self;

import ak.p;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import b5.s0;
import ba.w0;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.self.ImageCropActivity;
import com.assetgro.stockgro.ui.profile.self.ImagePreviewActivity;
import com.bumptech.glide.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import e.c;
import gd.b;
import java.util.List;
import kj.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import nk.a;
import nk.e;
import okhttp3.HttpUrl;
import q3.h;
import qu.i0;
import vt.x;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/profile/self/ImagePreviewActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/profile/self/EditProfileViewModel;", "Lba/w0;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ImagePreviewActivity extends b {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f10046n = 0;

    /* renamed from: k, reason: collision with root package name */
    public final c f10047k;

    /* renamed from: l, reason: collision with root package name */
    public final c f10048l;

    /* renamed from: m, reason: collision with root package name */
    public final c f10049m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [f.a, java.lang.Object] */
    public ImagePreviewActivity() {
        final int i10 = 0;
        c registerForActivityResult = registerForActivityResult(new Object(), new e.b(this) { // from class: ih.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImagePreviewActivity f20025b;

            {
                this.f20025b = this;
            }

            @Override // e.b
            public final void d(Object obj) {
                Uri uri;
                Intent intent;
                Uri data;
                int i11 = i10;
                ImagePreviewActivity this$0 = this.f20025b;
                switch (i11) {
                    case 0:
                        Uri uri2 = (Uri) obj;
                        int i12 = ImagePreviewActivity.f10046n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            Intent intent2 = new Intent(this$0, (Class<?>) ImageCropActivity.class);
                            intent2.putExtra("IMAGE_PATH", uri2.toString());
                            this$0.f10049m.a(intent2);
                            return;
                        }
                        return;
                    case 1:
                        e.a aVar = (e.a) obj;
                        int i13 = ImagePreviewActivity.f10046n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1) {
                            Object obj2 = null;
                            Intent intent3 = aVar.f14611b;
                            if (intent3 != null) {
                                uri = intent3.getData();
                            } else {
                                uri = null;
                            }
                            String.valueOf(uri);
                            if (intent3 != null) {
                                Bundle extras = intent3.getExtras();
                                if (extras != null) {
                                    obj2 = extras.get("data");
                                }
                                Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                                Uri fromFile = Uri.fromFile(vl.b.d(new ContextWrapper(this$0), (Bitmap) obj2));
                                if (fromFile != null) {
                                    Intent intent4 = new Intent(this$0, (Class<?>) ImageCropActivity.class);
                                    intent4.putExtra("IMAGE_PATH", fromFile.toString());
                                    this$0.f10049m.a(intent4);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e.a aVar2 = (e.a) obj;
                        int i14 = ImagePreviewActivity.f10046n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent = aVar2.f14611b) != null && (data = intent.getData()) != null) {
                            Intent intent5 = new Intent(this$0, (Class<?>) ImageCropActivity.class);
                            intent5.putExtra("IMAGE_PATH", data.toString());
                            this$0.f10049m.a(intent5);
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f10047k = registerForActivityResult;
        final int i11 = 1;
        c registerForActivityResult2 = registerForActivityResult(new Object(), new e.b(this) { // from class: ih.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImagePreviewActivity f20025b;

            {
                this.f20025b = this;
            }

            @Override // e.b
            public final void d(Object obj) {
                Uri uri;
                Intent intent;
                Uri data;
                int i112 = i11;
                ImagePreviewActivity this$0 = this.f20025b;
                switch (i112) {
                    case 0:
                        Uri uri2 = (Uri) obj;
                        int i12 = ImagePreviewActivity.f10046n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            Intent intent2 = new Intent(this$0, (Class<?>) ImageCropActivity.class);
                            intent2.putExtra("IMAGE_PATH", uri2.toString());
                            this$0.f10049m.a(intent2);
                            return;
                        }
                        return;
                    case 1:
                        e.a aVar = (e.a) obj;
                        int i13 = ImagePreviewActivity.f10046n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1) {
                            Object obj2 = null;
                            Intent intent3 = aVar.f14611b;
                            if (intent3 != null) {
                                uri = intent3.getData();
                            } else {
                                uri = null;
                            }
                            String.valueOf(uri);
                            if (intent3 != null) {
                                Bundle extras = intent3.getExtras();
                                if (extras != null) {
                                    obj2 = extras.get("data");
                                }
                                Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                                Uri fromFile = Uri.fromFile(vl.b.d(new ContextWrapper(this$0), (Bitmap) obj2));
                                if (fromFile != null) {
                                    Intent intent4 = new Intent(this$0, (Class<?>) ImageCropActivity.class);
                                    intent4.putExtra("IMAGE_PATH", fromFile.toString());
                                    this$0.f10049m.a(intent4);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e.a aVar2 = (e.a) obj;
                        int i14 = ImagePreviewActivity.f10046n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent = aVar2.f14611b) != null && (data = intent.getData()) != null) {
                            Intent intent5 = new Intent(this$0, (Class<?>) ImageCropActivity.class);
                            intent5.putExtra("IMAGE_PATH", data.toString());
                            this$0.f10049m.a(intent5);
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResult(...)");
        this.f10048l = registerForActivityResult2;
        final int i12 = 2;
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult(new Object(), new e.b(this) { // from class: ih.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImagePreviewActivity f20025b;

            {
                this.f20025b = this;
            }

            @Override // e.b
            public final void d(Object obj) {
                Uri uri;
                Intent intent;
                Uri data;
                int i112 = i12;
                ImagePreviewActivity this$0 = this.f20025b;
                switch (i112) {
                    case 0:
                        Uri uri2 = (Uri) obj;
                        int i122 = ImagePreviewActivity.f10046n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            Intent intent2 = new Intent(this$0, (Class<?>) ImageCropActivity.class);
                            intent2.putExtra("IMAGE_PATH", uri2.toString());
                            this$0.f10049m.a(intent2);
                            return;
                        }
                        return;
                    case 1:
                        e.a aVar = (e.a) obj;
                        int i13 = ImagePreviewActivity.f10046n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1) {
                            Object obj2 = null;
                            Intent intent3 = aVar.f14611b;
                            if (intent3 != null) {
                                uri = intent3.getData();
                            } else {
                                uri = null;
                            }
                            String.valueOf(uri);
                            if (intent3 != null) {
                                Bundle extras = intent3.getExtras();
                                if (extras != null) {
                                    obj2 = extras.get("data");
                                }
                                Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                                Uri fromFile = Uri.fromFile(vl.b.d(new ContextWrapper(this$0), (Bitmap) obj2));
                                if (fromFile != null) {
                                    Intent intent4 = new Intent(this$0, (Class<?>) ImageCropActivity.class);
                                    intent4.putExtra("IMAGE_PATH", fromFile.toString());
                                    this$0.f10049m.a(intent4);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e.a aVar2 = (e.a) obj;
                        int i14 = ImagePreviewActivity.f10046n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent = aVar2.f14611b) != null && (data = intent.getData()) != null) {
                            Intent intent5 = new Intent(this$0, (Class<?>) ImageCropActivity.class);
                            intent5.putExtra("IMAGE_PATH", data.toString());
                            this$0.f10049m.a(intent5);
                            return;
                        }
                        return;
                }
            }
        }), "registerForActivityResult(...)");
        c registerForActivityResult3 = registerForActivityResult(new Object(), new s0(2));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult3, "registerForActivityResult(...)");
        this.f10049m = registerForActivityResult3;
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_image_preview;
    }

    @Override // gd.b
    public final void I() {
        Drawable mutate;
        final int i10 = 0;
        ((w0) w()).f6497t.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ih.r

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImagePreviewActivity f20027b;

            {
                this.f20027b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                final ImagePreviewActivity this$0 = this.f20027b;
                switch (i11) {
                    case 0:
                        int i12 = ImagePreviewActivity.f10046n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    default:
                        int i13 = ImagePreviewActivity.f10046n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        final ao.f fVar = new ao.f(this$0, R.style.AppBottomSheetDialogTheme);
                        View inflate = this$0.getLayoutInflater().inflate(R.layout.fragment_bottom_sheet_photo_select, (ViewGroup) null);
                        fVar.setContentView(inflate);
                        fVar.show();
                        final int i14 = 0;
                        ((AppCompatImageView) inflate.findViewById(R.id.camera)).setOnClickListener(new View.OnClickListener() { // from class: ih.s
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i15 = i14;
                                ao.f mBottomSheetDialog = fVar;
                                ImagePreviewActivity this$02 = this$0;
                                switch (i15) {
                                    case 0:
                                        int i16 = ImagePreviewActivity.f10046n;
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                                        this$02.K();
                                        mBottomSheetDialog.dismiss();
                                        return;
                                    default:
                                        int i17 = ImagePreviewActivity.f10046n;
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                                        this$02.getClass();
                                        this$02.f10047k.a(i0.e(f.d.f15871a));
                                        mBottomSheetDialog.dismiss();
                                        return;
                                }
                            }
                        });
                        final int i15 = 1;
                        ((AppCompatImageView) inflate.findViewById(R.id.gallery)).setOnClickListener(new View.OnClickListener() { // from class: ih.s
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i152 = i15;
                                ao.f mBottomSheetDialog = fVar;
                                ImagePreviewActivity this$02 = this$0;
                                switch (i152) {
                                    case 0:
                                        int i16 = ImagePreviewActivity.f10046n;
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                                        this$02.K();
                                        mBottomSheetDialog.dismiss();
                                        return;
                                    default:
                                        int i17 = ImagePreviewActivity.f10046n;
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                                        this$02.getClass();
                                        this$02.f10047k.a(i0.e(f.d.f15871a));
                                        mBottomSheetDialog.dismiss();
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        ((w0) w()).f6497t.setTitle(HttpUrl.FRAGMENT_ENCODE_SET);
        Drawable navigationIcon = ((w0) w()).f6497t.getNavigationIcon();
        if (navigationIcon != null && (mutate = navigationIcon.mutate()) != null) {
            mutate.setTint(-1);
            ((w0) w()).f6497t.setNavigationIcon(mutate);
        }
        final int i11 = 1;
        ((w0) w()).f6496s.setOnClickListener(new View.OnClickListener(this) { // from class: ih.r

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImagePreviewActivity f20027b;

            {
                this.f20027b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                final ImagePreviewActivity this$0 = this.f20027b;
                switch (i112) {
                    case 0:
                        int i12 = ImagePreviewActivity.f10046n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    default:
                        int i13 = ImagePreviewActivity.f10046n;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        final ao.f fVar = new ao.f(this$0, R.style.AppBottomSheetDialogTheme);
                        View inflate = this$0.getLayoutInflater().inflate(R.layout.fragment_bottom_sheet_photo_select, (ViewGroup) null);
                        fVar.setContentView(inflate);
                        fVar.show();
                        final int i14 = 0;
                        ((AppCompatImageView) inflate.findViewById(R.id.camera)).setOnClickListener(new View.OnClickListener() { // from class: ih.s
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i152 = i14;
                                ao.f mBottomSheetDialog = fVar;
                                ImagePreviewActivity this$02 = this$0;
                                switch (i152) {
                                    case 0:
                                        int i16 = ImagePreviewActivity.f10046n;
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                                        this$02.K();
                                        mBottomSheetDialog.dismiss();
                                        return;
                                    default:
                                        int i17 = ImagePreviewActivity.f10046n;
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                                        this$02.getClass();
                                        this$02.f10047k.a(i0.e(f.d.f15871a));
                                        mBottomSheetDialog.dismiss();
                                        return;
                                }
                            }
                        });
                        final int i15 = 1;
                        ((AppCompatImageView) inflate.findViewById(R.id.gallery)).setOnClickListener(new View.OnClickListener() { // from class: ih.s
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i152 = i15;
                                ao.f mBottomSheetDialog = fVar;
                                ImagePreviewActivity this$02 = this$0;
                                switch (i152) {
                                    case 0:
                                        int i16 = ImagePreviewActivity.f10046n;
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                                        this$02.K();
                                        mBottomSheetDialog.dismiss();
                                        return;
                                    default:
                                        int i17 = ImagePreviewActivity.f10046n;
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                                        this$02.getClass();
                                        this$02.f10047k.a(i0.e(f.d.f15871a));
                                        mBottomSheetDialog.dismiss();
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
    }

    public final void K() {
        if (f.l(this)) {
            this.f10048l.a(new Intent("android.media.action.IMAGE_CAPTURE"));
            return;
        }
        ag.b action = new ag.b(this, 15);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        List a10 = x.a("android.permission.CAMERA");
        if (f.l(this)) {
            action.mo2invoke();
        } else if (h.b(this, "android.permission.CAMERA")) {
            dp.b.M1(this, getString(R.string.text_camera_permission_rationale));
        } else {
            requestPermissions((String[]) a10.toArray(new String[0]), 101);
        }
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
        if (i10 == 101) {
            if (f.l(this)) {
                K();
            } else {
                dp.b.M1(this, getString(R.string.text_camera_permission_rationale));
            }
        }
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        super.onResume();
        String stringExtra = getIntent().getStringExtra("IMAGE_URL");
        a p10 = ((e) ((e) new a().f(p.f555a)).q()).p(new qk.b(String.valueOf(System.currentTimeMillis())));
        Intrinsics.checkNotNullExpressionValue(p10, "signature(...)");
        e eVar = (e) p10;
        if (stringExtra != null) {
            ((g) ((g) ((g) ((g) com.bumptech.glide.b.c(this).f(this).m(stringExtra).w(eVar).e()).i()).l(R.drawable.ic_placeholder_user)).p(new qk.b(((EditProfileViewModel) x()).f9081d.getUserImageSignature()))).z(((w0) w()).f6498u);
        }
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.d();
        FirebaseAnalytics d10 = activityComponent.f14246a.d();
        yk.g.i(d10);
        this.f17256d = d10;
        Analytics o10 = activityComponent.f14246a.o();
        yk.g.i(o10);
        this.f17257e = o10;
        n0 h10 = activityComponent.f14246a.h();
        yk.g.i(h10);
        this.f17258f = h10;
    }
}
