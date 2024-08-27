package fu;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "it", HttpUrl.FRAGMENT_ENCODE_SET, "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class m extends iu.k implements Function1<String, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f16268a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ArrayList arrayList) {
        super(1);
        this.f16268a = arrayList;
    }

    public final void a(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.f16268a.add(it);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((String) obj);
        return Unit.f23355a;
    }
}
