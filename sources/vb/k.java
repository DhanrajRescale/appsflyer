package vb;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.FeedPostImage;
import com.assetgro.stockgro.ui.social.presentation.slider.ImageSliderActivity;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.y;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f37911b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hb.k f37912c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, hb.k kVar) {
        super(0);
        this.f37910a = 1;
        this.f37911b = context;
        this.f37912c = kVar;
    }

    public final void a() {
        String str;
        String str2;
        String str3;
        String str4;
        int i10 = this.f37910a;
        Context context = this.f37911b;
        String str5 = null;
        hb.k kVar = this.f37912c;
        switch (i10) {
            case 0:
                if (kVar != null) {
                    str = kVar.f18197a;
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    if (kVar != null) {
                        str2 = kVar.f18201e;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null && str2.length() != 0) {
                        String str6 = HttpUrl.FRAGMENT_ENCODE_SET;
                        if (kVar == null || (str3 = kVar.f18197a) == null) {
                            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (kVar != null && (str4 = kVar.f18201e) != null) {
                            str6 = str4;
                        }
                        if (kVar != null) {
                            str5 = kVar.f18198b;
                        }
                        el.l.u0(context, str3, str6, str5);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Intent intent = new Intent(context, (Class<?>) ImageSliderActivity.class);
                String uuid = UUID.randomUUID().toString();
                Intrinsics.c(kVar);
                di.a aVar = di.a.f14383a;
                Intrinsics.c(uuid);
                intent.putParcelableArrayListExtra("POST_IMAGES", y.c(new FeedPostImage(uuid, aVar, null, kVar.f18197a)));
                intent.putExtra("POST_IMAGES_INDEX", 0);
                context.startActivity(intent);
                return;
            default:
                String uuid2 = UUID.randomUUID().toString();
                String str7 = kVar.f18197a;
                di.a aVar2 = di.a.f14383a;
                Intrinsics.c(uuid2);
                ArrayList<? extends Parcelable> c10 = y.c(new FeedPostImage(uuid2, aVar2, null, str7));
                Intent intent2 = new Intent(context, (Class<?>) ImageSliderActivity.class);
                intent2.putParcelableArrayListExtra("POST_IMAGES", c10);
                intent2.putExtra("POST_IMAGES_INDEX", 0);
                context.startActivity(intent2);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f37910a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(hb.k kVar, Context context, int i10) {
        super(0);
        this.f37910a = i10;
        this.f37912c = kVar;
        this.f37911b = context;
    }
}
