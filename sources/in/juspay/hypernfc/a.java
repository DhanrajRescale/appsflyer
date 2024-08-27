package in.juspay.hypernfc;

import in.juspay.hypernfc.NfcActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20187b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f20186a = i10;
        this.f20187b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20186a;
        Object obj = this.f20187b;
        switch (i10) {
            case 0:
                NfcActivity.AnonymousClass1.a((NfcActivity.AnonymousClass1) obj);
                return;
            default:
                NfcActivity.r((NfcActivity) obj);
                return;
        }
    }
}
