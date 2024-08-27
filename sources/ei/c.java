package ei;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import ba.z8;
import com.assetgro.stockgro.data.model.FeedPostImage;
import com.assetgro.stockgro.data.model.ImageSource;
import com.bumptech.glide.g;
import iu.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f15444a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(1);
        this.f15444a = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object parse;
        ImageSource imageSource = ((FeedPostImage) obj).getImageSource();
        if (imageSource instanceof ImageSource.SourceURL) {
            parse = ((ImageSource.SourceURL) imageSource).getValue();
        } else if (imageSource instanceof ImageSource.SourceURI) {
            parse = Uri.parse(((ImageSource.SourceURI) imageSource).getValue());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        d dVar = this.f15444a;
        g i10 = com.bumptech.glide.b.e(dVar.f22629a.getContext()).i(Drawable.class);
        i10.F = parse;
        i10.J = true;
        i10.z(((z8) dVar.f17291u).f6821s);
        return Unit.f23355a;
    }
}
