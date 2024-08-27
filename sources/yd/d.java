package yd;

import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.ExitOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f41528b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f41529c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f41530d = new d(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f41531e = new d(3);

    /* renamed from: f, reason: collision with root package name */
    public static final d f41532f = new d(4);

    /* renamed from: g, reason: collision with root package name */
    public static final d f41533g = new d(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41534a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f41534a = i10;
    }

    public final void a(ChatMessage it) {
        switch (this.f41534a) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return;
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f41534a) {
            case 0:
                CharSequence it = (CharSequence) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                c cVar = e.f41535b;
                e.f41537d = new ExitOption("OTHERS", it.toString());
                return Unit.f23355a;
            case 1:
                a((ChatMessage) obj);
                return Unit.f23355a;
            case 2:
                a((ChatMessage) obj);
                return Unit.f23355a;
            case 3:
                a((ChatMessage) obj);
                return Unit.f23355a;
            case 4:
                a((ChatMessage) obj);
                return Unit.f23355a;
            default:
                a((ChatMessage) obj);
                return Unit.f23355a;
        }
    }
}
