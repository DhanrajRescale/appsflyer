package c2;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final j f7737b = new j(1);

    /* renamed from: c, reason: collision with root package name */
    public static final j f7738c = new j(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7739a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10) {
        super(0);
        this.f7739a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f7739a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return new androidx.compose.ui.node.a(2, true, 0);
                    default:
                        return new androidx.compose.ui.node.a(3, false, 0);
                }
            case 1:
                return new LinkedHashMap();
            default:
                switch (i10) {
                    case 0:
                        return new androidx.compose.ui.node.a(2, true, 0);
                    default:
                        return new androidx.compose.ui.node.a(3, false, 0);
                }
        }
    }
}
