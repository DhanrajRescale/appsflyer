package com.takusemba.cropme;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.assetgro.stockgro.prod.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vs.a;
import vs.b;
import vs.c;
import vs.d;
import vs.e;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lcom/takusemba/cropme/CropLayout;", "Landroid/widget/FrameLayout;", "Landroid/net/Uri;", "uri", HttpUrl.FRAGMENT_ENCODE_SET, "setUri", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "ll/e", "cropme_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class CropLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final b f12120a;

    /* renamed from: b, reason: collision with root package name */
    public final d f12121b;

    /* renamed from: c, reason: collision with root package name */
    public RectF f12122c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f12123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.appcompat.widget.AppCompatImageView, vs.b, android.widget.ImageView, android.view.View] */
    public CropLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        d aVar;
        Intrinsics.e(context, "context");
        this.f12123d = new CopyOnWriteArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f38305a, 0, 0);
        try {
            ?? appCompatImageView = new AppCompatImageView(context, null, 0);
            appCompatImageView.setId(R.id.cropme_image_view);
            appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            appCompatImageView.setAdjustViewBounds(true);
            appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            addView((View) appCompatImageView, 0);
            this.f12120a = appCompatImageView;
            int i10 = obtainStyledAttributes.getInt(5, 1);
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            aVar = new a(context, attributeSet, 2);
                        } else {
                            View findViewById = LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(1, -1), (ViewGroup) null).findViewById(R.id.cropme_overlay);
                            Intrinsics.b(findViewById, "view.findViewById(R.id.cropme_overlay)");
                            aVar = (d) findViewById;
                        }
                    } else {
                        aVar = new a(context, attributeSet, 0);
                    }
                } else {
                    aVar = new a(context, attributeSet, 2);
                }
            } else {
                aVar = new a(context, attributeSet, 1);
            }
            aVar.setId(R.id.cropme_overlay);
            aVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            addView(aVar, 1);
            this.f12121b = aVar;
            float f10 = obtainStyledAttributes.getFloat(4, 2.0f);
            float fraction = obtainStyledAttributes.getFraction(3, 1, 1, 0.8f);
            float fraction2 = obtainStyledAttributes.getFraction(2, 1, 1, 0.8f);
            obtainStyledAttributes.recycle();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new c(this, fraction, fraction2, f10, viewTreeObserver));
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final boolean a() {
        if (this.f12122c != null) {
            this.f12120a.getHitRect(new Rect());
            return !r1.contains((int) r0.left, (int) r0.top, (int) r0.right, (int) r0.bottom);
        }
        return false;
    }

    public final void setBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.e(bitmap, "bitmap");
        b bVar = this.f12120a;
        bVar.setImageBitmap(bitmap);
        bVar.requestLayout();
    }

    public final void setUri(@NotNull Uri uri) {
        Intrinsics.e(uri, "uri");
        b bVar = this.f12120a;
        bVar.setImageURI(uri);
        bVar.requestLayout();
    }
}
