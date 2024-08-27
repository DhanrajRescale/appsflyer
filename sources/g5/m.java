package g5;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements kp.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16596a;

    @Override // kp.h
    public final boolean apply(Object obj) {
        switch (this.f16596a) {
            case 0:
                if (((Map.Entry) obj).getKey() == null) {
                    return false;
                }
                return true;
            default:
                if (((String) obj) == null) {
                    return false;
                }
                return true;
        }
    }
}
