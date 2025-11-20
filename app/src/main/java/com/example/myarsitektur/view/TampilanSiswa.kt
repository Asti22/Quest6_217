package com.example.myarsitektur.view

import androidx.compose.runtime.Composable

@Composable
fun TampilSiswa(

    statusUISiswa: Siswa,
    onBackButtonClicked: () -> Unit
){
    val items = listOf(
        Pair(stringResource(R.string.nama_lengkap), statusUISiswa.nama),
        Pair(stringResource(R.string.jenis_kelamin), statusUISiswa.gender),
        Pair(stringResource(R.string.alamat), statusUISiswa.alamat)
    )
}