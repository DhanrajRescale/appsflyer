package lf;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f24615b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i10) {
        super(2);
        this.f24614a = i10;
        this.f24615b = bVar;
    }

    public final void a(t0.n nVar, int i10) {
        String str;
        String string;
        int i11 = this.f24614a;
        int i12 = 0;
        b bVar = this.f24615b;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                Bundle arguments = bVar.getArguments();
                String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (arguments == null || (str = arguments.getString("center_popup_text")) == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                Bundle arguments2 = bVar.getArguments();
                if (arguments2 != null && (string = arguments2.getString("center_popup_image_url")) != null) {
                    str2 = string;
                }
                zq.f.b(0, 0, nVar, str, str2);
                return;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                hl.f.e(new lc.b(bVar, 23), null, b1.d.c(221685759, new a(bVar, i12), nVar), nVar, 384, 2);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24614a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
