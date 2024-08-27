package zd;

import com.assetgro.stockgro.data.model.ChatMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final l f42429b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f42430c = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42431a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10) {
        super(1);
        this.f42431a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f42431a) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f23355a;
            default:
                return ((ChatMessage) obj).getSenderName();
        }
    }
}
