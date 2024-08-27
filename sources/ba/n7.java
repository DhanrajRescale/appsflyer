package ba;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSection;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import me.relex.circleindicator.CircleIndicator2;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class n7 extends m7 {
    public static final SparseIntArray I;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.extra_title, 7);
        sparseIntArray.put(R.id.whats_new_prepzone, 8);
        sparseIntArray.put(R.id.spacer_16_dp, 9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5, types: [k7.z0, rc.h] */
    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        ArenaSection arenaSection;
        rc.e eVar;
        int i10;
        int i11;
        String str2;
        String scrollPrefixUpcoming;
        String leagueType;
        List<ArenaGame> listOfLeagueDto;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        String str3;
        int a10;
        View e10;
        int color;
        long j11;
        String str4;
        int i14;
        int i15;
        int i16;
        boolean z12;
        boolean z13;
        long j12;
        long j13;
        synchronized (this) {
            j10 = this.H;
            this.H = 0L;
        }
        rc.d listener = this.D;
        String str5 = this.B;
        ArenaSection arenaSection2 = this.F;
        rc.i listener2 = this.C;
        rc.e eVar2 = this.E;
        long j14 = j10 & 109;
        int i17 = 8;
        if ((111 & j10) != 0) {
            long j15 = j10 & 68;
            if (j15 != 0 && arenaSection2 != null) {
                str4 = arenaSection2.getTitle();
            } else {
                str4 = null;
            }
            if (j14 != 0) {
                if (arenaSection2 != null) {
                    listOfLeagueDto = arenaSection2.getArenaGames();
                    scrollPrefixUpcoming = arenaSection2.getScroll();
                    leagueType = arenaSection2.getType();
                } else {
                    scrollPrefixUpcoming = null;
                    leagueType = null;
                    listOfLeagueDto = null;
                }
                if (j15 != 0) {
                    if (listOfLeagueDto != null) {
                        i15 = listOfLeagueDto.size();
                    } else {
                        i15 = 0;
                    }
                    if (scrollPrefixUpcoming != null) {
                        z10 = scrollPrefixUpcoming.equalsIgnoreCase("H");
                    } else {
                        z10 = false;
                    }
                    if (j15 != 0) {
                        if (z10) {
                            j10 |= 256;
                        } else {
                            j10 |= 128;
                        }
                    }
                    if (leagueType != null) {
                        z12 = leagueType.equalsIgnoreCase("open");
                    } else {
                        z12 = false;
                    }
                    if ((j10 & 68) != 0) {
                        if (z12) {
                            j13 = 4096;
                        } else {
                            j13 = 2048;
                        }
                        j10 |= j13;
                    }
                    if (i15 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z12) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    if ((j10 & 68) != 0) {
                        if (z13) {
                            j12 = Http2Stream.EMIT_BUFFER_SIZE;
                        } else {
                            j12 = 8192;
                        }
                        j10 |= j12;
                    }
                    if (!z13) {
                        i16 = 8;
                        String str6 = str4;
                        str = str5;
                        i10 = i14;
                        i12 = i15;
                        arenaSection = arenaSection2;
                        i11 = i16;
                        eVar = eVar2;
                        str2 = str6;
                    }
                    i16 = 0;
                    String str62 = str4;
                    str = str5;
                    i10 = i14;
                    i12 = i15;
                    arenaSection = arenaSection2;
                    i11 = i16;
                    eVar = eVar2;
                    str2 = str62;
                }
            } else {
                scrollPrefixUpcoming = null;
                leagueType = null;
                listOfLeagueDto = null;
            }
            i14 = 0;
            z10 = false;
            i15 = 0;
            i16 = 0;
            String str622 = str4;
            str = str5;
            i10 = i14;
            i12 = i15;
            arenaSection = arenaSection2;
            i11 = i16;
            eVar = eVar2;
            str2 = str622;
        } else {
            str = str5;
            arenaSection = arenaSection2;
            eVar = eVar2;
            i10 = 0;
            i11 = 0;
            str2 = null;
            scrollPrefixUpcoming = null;
            leagueType = null;
            listOfLeagueDto = null;
            i12 = 0;
            z10 = false;
        }
        if ((256 & j10) != 0 && i12 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j16 = j10 & 68;
        if (j16 != 0) {
            if (!z10) {
                z11 = false;
            }
            if (j16 != 0) {
                if (z11) {
                    j11 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
                } else {
                    j11 = 512;
                }
                j10 |= j11;
            }
            if (z11) {
                i17 = 0;
            }
            i13 = i17;
        } else {
            i13 = 0;
        }
        if ((j10 & 68) != 0) {
            this.f5440t.setVisibility(i13);
            this.f5441u.setVisibility(i10);
            al.d.X0(this.f5442v, scrollPrefixUpcoming);
            qu.i0.K(this.f5444x, str2);
            this.f5444x.setVisibility(i10);
            ConstraintLayout constraintLayout = this.f5445y;
            Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
            Intrinsics.checkNotNullParameter(leagueType, "type");
            if (kotlin.text.s.j(leagueType, "promoted", true)) {
                color = r3.k.getColor(constraintLayout.getContext(), R.color.light_peach);
            } else if (!kotlin.text.s.j(leagueType, "private", true) && !kotlin.text.s.j(leagueType, "invitation", true) && !kotlin.text.s.j(leagueType, "invited", true)) {
                color = r3.k.getColor(constraintLayout.getContext(), R.color.stream_transparent);
            } else {
                color = r3.k.getColor(constraintLayout.getContext(), R.color.light_purple);
            }
            constraintLayout.setBackgroundColor(color);
            this.f5446z.setVisibility(i11);
        }
        if ((109 & j10) != 0) {
            RecyclerView recyclerView = this.f5442v;
            CircleIndicator2 indicator2 = this.f5440t;
            Intrinsics.checkNotNullParameter(recyclerView, "<this>");
            Intrinsics.checkNotNullParameter(listOfLeagueDto, "listOfLeagueDto");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(indicator2, "indicator2");
            Intrinsics.checkNotNullParameter(scrollPrefixUpcoming, "scrollPrefixUpcoming");
            Intrinsics.checkNotNullParameter(listener2, "nestedScrollDisableListener");
            Intrinsics.checkNotNullParameter(leagueType, "leagueType");
            rc.e refreshListenerInner = eVar;
            Intrinsics.checkNotNullParameter(refreshListenerInner, "arenaUpcomingRefreshListener");
            ?? z0Var = new k7.z0();
            z0Var.f33591e = new ArrayList();
            z0Var.f33592f = HttpUrl.FRAGMENT_ENCODE_SET;
            ArrayList tempInnerList = (ArrayList) listOfLeagueDto;
            Intrinsics.checkNotNullParameter(tempInnerList, "tempInnerList");
            z0Var.f33591e.clear();
            k7.s e11 = k7.w.e(new rc.b(z0Var.f33591e, tempInnerList));
            Intrinsics.checkNotNullExpressionValue(e11, "calculateDiff(...)");
            e11.a(new k7.c(z0Var));
            z0Var.f33591e = tempInnerList;
            Intrinsics.checkNotNullParameter(listener, "listener");
            z0Var.f33593g = listener;
            Intrinsics.checkNotNullParameter(leagueType, "leagueType");
            z0Var.f33592f = leagueType;
            Intrinsics.checkNotNullParameter(refreshListenerInner, "refreshListenerInner");
            z0Var.f33594h = refreshListenerInner;
            recyclerView.setAdapter(z0Var);
            recyclerView.setOnFlingListener(null);
            if (Intrinsics.a(scrollPrefixUpcoming, "H")) {
                Intrinsics.checkNotNullParameter(listener2, "listener");
                z0Var.f33595i = listener2;
                k7.v0 v0Var = new k7.v0();
                v0Var.a(recyclerView);
                indicator2.f27726k = recyclerView;
                indicator2.f27727l = v0Var;
                int i18 = -1;
                indicator2.f42842j = -1;
                k7.z0 adapter = recyclerView.getAdapter();
                if (adapter == null) {
                    a10 = 0;
                } else {
                    a10 = adapter.a();
                }
                k7.i1 layoutManager = indicator2.f27726k.getLayoutManager();
                if (layoutManager != null && (e10 = indicator2.f27727l.e(layoutManager)) != null) {
                    i18 = k7.i1.H(e10);
                }
                indicator2.b(a10, i18);
                ArrayList arrayList = recyclerView.A0;
                k7.y yVar = indicator2.f27728m;
                if (arrayList != null) {
                    arrayList.remove(yVar);
                }
                recyclerView.j(yVar);
            }
        }
        if ((j10 & 70) != 0) {
            TextView textView = this.f5443w;
            Intrinsics.checkNotNullParameter(textView, "<this>");
            ArenaSection arenaSection3 = arenaSection;
            Intrinsics.checkNotNullParameter(arenaSection3, "arenaSection");
            String assetType = str;
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            if (Intrinsics.a(assetType, "ALL")) {
                str3 = sc.k.f34569j;
            } else if (Intrinsics.a(assetType, "EQUITY")) {
                str3 = sc.k.f34570k;
            } else {
                str3 = "Start Time";
            }
            if (Intrinsics.a(arenaSection3.getType(), "open")) {
                textView.setVisibility(0);
                String string = textView.getResources().getString(R.string.sorted_by_normal);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                SpannableString spannableString = new SpannableString(a3.a.g(string, " ", str3));
                spannableString.setSpan(new ForegroundColorSpan(r3.k.getColor(textView.getContext(), R.color.black_1A1A1A)), 0, string.length(), 0);
                spannableString.setSpan(new ForegroundColorSpan(r3.k.getColor(textView.getContext(), R.color.arenaTitle)), string.length(), str3.length() + string.length() + 1, 0);
                spannableString.setSpan(new StyleSpan(1), string.length(), str3.length() + string.length() + 1, 0);
                spannableString.setSpan(new StyleSpan(1), 0, string.length(), 0);
                spannableString.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, 12, textView.getContext().getResources().getDisplayMetrics())), 0, spannableString.length(), 0);
                textView.setText(spannableString, TextView.BufferType.SPANNABLE);
                return;
            }
            textView.setVisibility(0);
            textView.setText(arenaSection3.getTitle());
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.H != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m4.m
    public final void h() {
        synchronized (this) {
            this.H = 64L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }

    @Override // ba.m7
    public final void r(ArenaSection arenaSection) {
        this.F = arenaSection;
        synchronized (this) {
            this.H |= 4;
        }
        a(6);
        m();
    }
}
