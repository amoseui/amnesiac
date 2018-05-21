## vimrc
### case 관련 
```vim
set ignorecase
set smartcase
set infercase

" remove the traillings on save
autocmd BufWritePre * %s/\s\+$//e
```

### 단축키