package ea;

import com.assetgro.stockgro.ui.base.BaseBottomSheetViewModel;
import com.assetgro.stockgro.ui.base.BaseDialogViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15120c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(pj.a aVar, ct.a aVar2, int i10) {
        super(0);
        this.f15118a = i10;
        this.f15119b = aVar;
        this.f15120c = aVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15118a;
        ct.a compositeDisposable = this.f15120c;
        pj.a schedulerProvider = this.f15119b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 1:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 2:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 3:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 4:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 5:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 6:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 7:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 8:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 9:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 10:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 11:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 12:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 13:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 14:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 15:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 16:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 17:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            default:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                return new BaseDialogViewModel(schedulerProvider, compositeDisposable);
        }
    }
}
