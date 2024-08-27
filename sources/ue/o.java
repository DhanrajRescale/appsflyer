package ue;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.widget.ImageView;
import com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends ok.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ImageView f37115f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f37116g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ImageView imageView, MessageThreadInfoActivity messageThreadInfoActivity) {
        super(imageView, 0);
        this.f37115f = imageView;
        this.f37116g = messageThreadInfoActivity;
    }

    @Override // ok.b, ok.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void i(Bitmap bitmap) {
        v3.i iVar = new v3.i(this.f37116g.getResources(), bitmap);
        Intrinsics.checkNotNullExpressionValue(iVar, "create(...)");
        iVar.f37689k = true;
        iVar.f37688j = true;
        BitmapShader bitmapShader = iVar.f37683e;
        Paint paint = iVar.f37682d;
        iVar.f37685g = Math.min(iVar.f37691m, iVar.f37690l) / 2;
        paint.setShader(bitmapShader);
        iVar.invalidateSelf();
        this.f37115f.setImageDrawable(iVar);
    }
}
