package e5;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public Message f15042a;

    public final void a() {
        this.f15042a = null;
        ArrayList arrayList = t.f15043b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f15042a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
