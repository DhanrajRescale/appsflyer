package n9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import j9.z;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class u extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j9.i f28534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f28535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, j9.i iVar, String str, yt.a aVar) {
        super(2, aVar);
        this.f28534a = iVar;
        this.f28535b = context;
        this.f28536c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new u(this.f28535b, this.f28534a, this.f28536c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        for (z asset : this.f28534a.f21169d.values()) {
            Intrinsics.checkNotNullExpressionValue(asset, "asset");
            Bitmap bitmap = asset.f21253d;
            String filename = asset.f21252c;
            if (bitmap == null) {
                Intrinsics.checkNotNullExpressionValue(filename, "filename");
                if (kotlin.text.s.r(filename, "data:", false) && kotlin.text.w.A(filename, "base64,", 0, false, 6) > 0) {
                    try {
                        String substring = filename.substring(kotlin.text.w.z(filename, ',', 0, false, 6) + 1);
                        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                        byte[] decode = Base64.decode(substring, 0);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        asset.f21253d = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    } catch (IllegalArgumentException e10) {
                        w9.b.c("data URL did not have correct base64 format.", e10);
                    }
                }
            }
            Context context = this.f28535b;
            if (asset.f21253d == null && (str = this.f28536c) != null) {
                try {
                    InputStream open = context.getAssets().open(Intrinsics.i(filename, str));
                    Intrinsics.checkNotNullExpressionValue(open, "try {\n        context.as…, e)\n        return\n    }");
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        asset.f21253d = w9.f.e(BitmapFactory.decodeStream(open, null, options2), asset.f21250a, asset.f21251b);
                    } catch (IllegalArgumentException e11) {
                        w9.b.c("Unable to decode image.", e11);
                    }
                } catch (IOException e12) {
                    w9.b.c("Unable to open asset.", e12);
                }
            }
        }
        return Unit.f23355a;
    }
}
