package ae;

import com.assetgro.stockgro.data.model.ChatMessage;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f380b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f381c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f382d = new e(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f383a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f383a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f383a;
        switch (i10) {
            case 0:
                ChatMessage it = (ChatMessage) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
                return Unit.f23355a;
            case 1:
                ChatMessage it2 = (ChatMessage) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
                return Unit.f23355a;
            default:
                return ((ChatMessage) obj).getSenderName();
        }
    }
}
