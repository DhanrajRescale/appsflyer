package n1;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f28156a = new Object();

    @NotNull
    public final BlendModeColorFilter a(long j10, int i10) {
        a.j();
        return a.e(androidx.compose.ui.graphics.a.y(j10), androidx.compose.ui.graphics.a.w(i10));
    }

    @NotNull
    public final m b(@NotNull BlendModeColorFilter blendModeColorFilter) {
        int color;
        BlendMode mode;
        int ordinal;
        int i10;
        color = blendModeColorFilter.getColor();
        long c10 = androidx.compose.ui.graphics.a.c(color);
        mode = blendModeColorFilter.getMode();
        int[] iArr = b.f28117a;
        ordinal = mode.ordinal();
        switch (iArr[ordinal]) {
            case 1:
                i10 = 0;
                break;
            case 2:
                i10 = 1;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
            default:
                i10 = 3;
                break;
            case 5:
                i10 = 4;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 7;
                break;
            case 9:
                i10 = 8;
                break;
            case 10:
                i10 = 9;
                break;
            case 11:
                i10 = 10;
                break;
            case 12:
                i10 = 11;
                break;
            case 13:
                i10 = 12;
                break;
            case 14:
                i10 = 13;
                break;
            case 15:
                i10 = 14;
                break;
            case 16:
                i10 = 15;
                break;
            case 17:
                i10 = 16;
                break;
            case 18:
                i10 = 17;
                break;
            case 19:
                i10 = 18;
                break;
            case 20:
                i10 = 19;
                break;
            case 21:
                i10 = 20;
                break;
            case 22:
                i10 = 21;
                break;
            case 23:
                i10 = 22;
                break;
            case 24:
                i10 = 23;
                break;
            case 25:
                i10 = 24;
                break;
            case 26:
                i10 = 25;
                break;
            case 27:
                i10 = 26;
                break;
            case 28:
                i10 = 27;
                break;
            case 29:
                i10 = 28;
                break;
        }
        return new m(c10, i10, blendModeColorFilter);
    }
}
