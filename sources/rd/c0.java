package rd;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.assetgro.stockgro.data.uimodel.StickerData;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 extends ok.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GroupChatViewModel f33611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StickerData f33612e;

    public c0(GroupChatViewModel groupChatViewModel, StickerData stickerData) {
        this.f33611d = groupChatViewModel;
        this.f33612e = stickerData;
    }

    @Override // ok.g
    public final void a(Object obj) {
        Bitmap image = (Bitmap) obj;
        Intrinsics.checkNotNullParameter(image, "image");
        this.f33611d.f9163a0.postValue(this.f33612e);
    }

    @Override // ok.g
    public final void h(Drawable drawable) {
    }
}
