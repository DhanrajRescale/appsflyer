package n5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f28277a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Looper looper) {
        super(looper);
        this.f28277a = gVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        Iterator it = this.f28277a.f28293m.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.o();
            if (Arrays.equals(dVar.f28273v, bArr)) {
                if (message.what == 2 && dVar.f28256e == 0 && dVar.f28267p == 4) {
                    int i10 = e5.x.f15050a;
                    dVar.h(false);
                    return;
                }
                return;
            }
        }
    }
}
