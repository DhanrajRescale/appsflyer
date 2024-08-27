package vj;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a implements Callable, et.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38107a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38108b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f38107a = i10;
        this.f38108b = obj;
    }

    @Override // et.d
    public final Object apply(Object obj) {
        return this.f38108b;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f38107a) {
            case 0:
                synchronized (((e) this.f38108b)) {
                    try {
                        Object obj = this.f38108b;
                        if (((e) obj).f38130i != null) {
                            ((e) obj).I();
                            if (((e) this.f38108b).j()) {
                                ((e) this.f38108b).z();
                                ((e) this.f38108b).f38132k = 0;
                            }
                            return null;
                        }
                        return null;
                    } finally {
                    }
                }
            case 1:
                View view = (View) ((WeakReference) this.f38108b).get();
                if (view != null && view.getWidth() != 0 && view.getHeight() != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                    view.draw(new Canvas(createBitmap));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                    String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
                    return encodeToString;
                }
                return HttpUrl.FRAGMENT_ENCODE_SET;
            default:
                return this.f38108b;
        }
    }

    public a(View rootView) {
        this.f38107a = 1;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f38108b = new WeakReference(rootView);
    }
}
