package h;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17662a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17663b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f17662a = i10;
        this.f17663b = obj;
    }

    private void a(Message message) {
        int size;
        tr.e[] eVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        a5.b bVar = (a5.b) this.f17663b;
        while (true) {
            synchronized (bVar.f176b) {
                try {
                    size = bVar.f178d.size();
                    if (size <= 0) {
                        return;
                    }
                    eVarArr = new tr.e[size];
                    bVar.f178d.toArray(eVarArr);
                    bVar.f178d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                tr.e eVar = eVarArr[i10];
                int size2 = ((ArrayList) eVar.f36362c).size();
                for (int i11 = 0; i11 < size2; i11++) {
                    a5.a aVar = (a5.a) ((ArrayList) eVar.f36362c).get(i11);
                    if (!aVar.f172d) {
                        aVar.f170b.onReceive(bVar.f175a, (Intent) eVar.f36361b);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0182 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0177  */
    /* JADX WARN: Type inference failed for: r11v36, types: [jp.h, java.lang.Object] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.f.handleMessage(android.os.Message):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Looper looper, int i10) {
        super(looper);
        this.f17662a = i10;
        this.f17663b = obj;
    }

    public f(DialogInterface dialogInterface) {
        this.f17662a = 0;
        this.f17663b = new WeakReference(dialogInterface);
    }
}
