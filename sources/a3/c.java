package a3;

/* loaded from: classes.dex */
public final class c extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super("Failure occurred while trying to finish a future.");
        this.f138a = i10;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f138a) {
            case 0:
                synchronized (this) {
                }
                return this;
            default:
                synchronized (this) {
                }
                return this;
        }
    }
}
