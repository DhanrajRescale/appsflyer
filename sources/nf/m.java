package nf;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final m f28652b = new m(0);

    /* renamed from: c, reason: collision with root package name */
    public static final m f28653c = new m(1);

    /* renamed from: d, reason: collision with root package name */
    public static final m f28654d = new m(2);

    /* renamed from: e, reason: collision with root package name */
    public static final m f28655e = new m(3);

    /* renamed from: f, reason: collision with root package name */
    public static final m f28656f = new m(4);

    /* renamed from: g, reason: collision with root package name */
    public static final m f28657g = new m(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28658a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10) {
        super(1);
        this.f28658a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f28658a) {
            case 0:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 1:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 2:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 3:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 4:
                invoke((Throwable) obj);
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }

    public final void invoke(Throwable th2) {
        switch (this.f28658a) {
            case 0:
                th2.printStackTrace();
                return;
            case 1:
                th2.printStackTrace();
                return;
            case 2:
                th2.printStackTrace();
                return;
            case 3:
                th2.printStackTrace();
                return;
            case 4:
                th2.printStackTrace();
                return;
            default:
                th2.printStackTrace();
                return;
        }
    }
}
