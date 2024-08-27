package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zaf extends zag {
    private final WeakReference<ImageManager.OnImageLoadedListener> zac;

    public zaf(ImageManager.OnImageLoadedListener onImageLoadedListener, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(onImageLoadedListener);
        this.zac = new WeakReference<>(onImageLoadedListener);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaf)) {
            return false;
        }
        zaf zafVar = (zaf) obj;
        ImageManager.OnImageLoadedListener onImageLoadedListener = this.zac.get();
        ImageManager.OnImageLoadedListener onImageLoadedListener2 = zafVar.zac.get();
        if (onImageLoadedListener2 != null && onImageLoadedListener != null && Objects.equal(onImageLoadedListener2, onImageLoadedListener) && Objects.equal(zafVar.zaa, this.zaa)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zaa);
    }

    @Override // com.google.android.gms.common.images.zag
    public final void zaa(Drawable drawable, boolean z10, boolean z11, boolean z12) {
        ImageManager.OnImageLoadedListener onImageLoadedListener;
        if (!z11 && (onImageLoadedListener = this.zac.get()) != null) {
            onImageLoadedListener.onImageLoaded(this.zaa.zaa, drawable, z12);
        }
    }
}
