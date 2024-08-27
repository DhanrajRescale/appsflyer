package ok;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class b extends d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30098e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ImageView imageView, int i10) {
        super(imageView);
        this.f30098e = i10;
    }

    @Override // ok.d
    public void i(Object obj) {
        switch (this.f30098e) {
            case 0:
                k((Bitmap) obj);
                return;
            default:
                ((ImageView) this.f30102b).setImageDrawable((Drawable) obj);
                return;
        }
    }

    public void k(Bitmap bitmap) {
        ((ImageView) this.f30102b).setImageBitmap(bitmap);
    }
}
