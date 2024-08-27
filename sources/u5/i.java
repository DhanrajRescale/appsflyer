package u5;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b5.m1;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import e5.x;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import r5.e1;

/* loaded from: classes.dex */
public final class i extends m1 {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f36789h0 = 0;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;

    /* renamed from: e0, reason: collision with root package name */
    public final boolean f36790e0;

    /* renamed from: f0, reason: collision with root package name */
    public final SparseArray f36791f0;

    /* renamed from: g0, reason: collision with root package name */
    public final SparseBooleanArray f36792g0;

    static {
        new i(new h());
        int i10 = x.f15050a;
        Integer.toString(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, 36);
        Integer.toString(1001, 36);
        Integer.toString(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(WebSocketProtocol.CLOSE_NO_STATUS_CODE, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
    }

    public i(h hVar) {
        super(hVar);
        this.A = hVar.A;
        this.B = hVar.B;
        this.C = hVar.C;
        this.D = hVar.D;
        this.E = hVar.E;
        this.F = hVar.F;
        this.G = hVar.G;
        this.H = hVar.H;
        this.I = hVar.I;
        this.J = hVar.J;
        this.X = hVar.K;
        this.Y = hVar.L;
        this.Z = hVar.M;
        this.f36790e0 = hVar.N;
        this.f36791f0 = hVar.O;
        this.f36792g0 = hVar.P;
    }

    @Override // b5.m1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (super.equals(iVar) && this.A == iVar.A && this.B == iVar.B && this.C == iVar.C && this.D == iVar.D && this.E == iVar.E && this.F == iVar.F && this.G == iVar.G && this.H == iVar.H && this.I == iVar.I && this.J == iVar.J && this.X == iVar.X && this.Y == iVar.Y && this.Z == iVar.Z && this.f36790e0 == iVar.f36790e0) {
            SparseBooleanArray sparseBooleanArray = this.f36792g0;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = iVar.f36792g0;
            if (sparseBooleanArray2.size() == size) {
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                            break;
                        }
                        i10++;
                    } else {
                        SparseArray sparseArray = this.f36791f0;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = iVar.f36791f0;
                        if (sparseArray2.size() == size2) {
                            for (int i11 = 0; i11 < size2; i11++) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i11);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            e1 e1Var = (e1) entry.getKey();
                                            if (map2.containsKey(e1Var) && x.a(entry.getValue(), map2.get(e1Var))) {
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // b5.m1
    public final int hashCode() {
        return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.X ? 1 : 0)) * 31) + (this.Y ? 1 : 0)) * 31) + (this.Z ? 1 : 0)) * 31) + (this.f36790e0 ? 1 : 0);
    }
}
