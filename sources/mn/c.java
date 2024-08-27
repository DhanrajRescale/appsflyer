package mn;

/* loaded from: classes2.dex */
public enum c implements iq.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f27846a;

    c(int i10) {
        this.f27846a = i10;
    }

    @Override // iq.c
    public final int a() {
        return this.f27846a;
    }
}
