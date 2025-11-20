package com.example.myarsitektur.view

import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.myarsitektur.R
import com.example.myarsitektur.model.Siswa

@Composable
fun TampilSiswa(

    statusUISiswa: Siswa,
    onBackButtonClicked: () -> Unit
){
    val items = listOf(
        Pair(stringResource("Nama Lengkap"), statusUISiswa.nama),
        Pair(stringResource(id = "Jenis Kelamin"), statusUISiswa.gender),
        Pair(stringResource("Alamat"), statusUISiswa.alamat)
    )

    Scaffold (modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(R.string.data_siswa), color = colorResource(R.color.white)) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(backgroundColor = colorResource(id = R.color.purple_500)),
            )
        }) { isRuang ->
        Column(
            modifier = Modifier.padding(paddingValues = isRuang),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.padding(dimensionResource(R.dimen.d8dp)),
                verticalArrangement = Arrangement.spacedBy(space = dimensionResource(R.dimen.d8dp))
            ) {
                items.forEach { item ->
                    Column {
                        Text(text = item.first.uppercase(), fontSize = 16.sp)
                        Text(text = item.second, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    }
                    Divider(thickness = dimensionResource(R.dimen.d1dp))
                }
            }

            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.d16dp)))
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = onBackButtonClicked
            ) {
                Text(text = stringResource(R.string.back))
            }

}